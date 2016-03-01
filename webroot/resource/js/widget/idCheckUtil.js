function showErrorMsg(element){
	var elementObj=$(element);
	var inputDoc=document.getElementsByName(elementObj.attr("name"))[0];
	var inputObject=$(inputDoc);
	if(inputObject.css("display")=="none" || inputObject.attr("type")=="hidden"){
		if(inputObject.next().css("display")!="none"){
			inputObject = inputObject.next();
		}else{
			inputObject = inputObject.parent();
		}
	}
	if(inputObject.attr("createMsg")==undefined||inputObject.attr("createMsg")=="false"){
		inputObject.poshytip('hide');
		var defaultOption={
			content:"<div class='inputName' inputName='"+inputObject.attr("name")+"'><span class='error'></span>身份证号不合法，请校对</div>"
		}
		inputObject.dialogtip(defaultOption);
		inputObject.poshytip('show');
		$(".tip-error").bgiframe();
		$(".tip-error").css("cursor","pointer");
		$(".tip-error").click(function(){
			var inputObj = $(document.getElementsByName($(this).find(".inputName").attr("inputName"))[0]);
			if(inputObj.css("display")=="none"){
				if(inputObj.next().css("display")!="none"){
					inputObj = inputObj.next();
				}else{
					inputObj = inputObj.parent();
				}
			}
			inputObj.attr("createMsg","false");
			$(this).remove();
		});
		inputObject.attr("createMsgIdCard","true");
	}
}
function checkIdcard(idcard,element) {
	if(idcard==null||$.trim(idcard)==""){
		return true;
	}
	// var idcard = document.forms[0].elements['idcard1'].value;
	// var idcard = document.getElementByIdx('asidinput').value;
	// var idcard = document.getElementsByName('idcard1')[0].value;
	var Errors = new Array("验证通过!", "身份证号码位数不对!", "身份证号码出生日期超出范围或含有非法字符!", "身份证号码校验错误!", "身份证地区非法!");
	var area = {
		11 : "北京",
		12 : "天津",
		13 : "河北",
		14 : "山西",
		15 : "内蒙古",
		21 : "辽宁",
		22 : "吉林",
		23 : "黑龙江",
		31 : "上海",
		32 : "江苏",
		33 : "浙江",
		34 : "安徽",
		35 : "福建",
		36 : "江西",
		37 : "山东",
		41 : "河南",
		42 : "湖北",
		43 : "湖南",
		44 : "广东",
		45 : "广西",
		46 : "海南",
		50 : "重庆",
		51 : "四川",
		52 : "贵州",
		53 : "云南",
		54 : "西藏",
		61 : "陕西",
		62 : "甘肃",
		63 : "青海",
		64 : "宁夏",
		65 : "新疆",
		71 : "台湾",
		81 : "香港",
		82 : "澳门",
		91 : "国外"
	};
	var idcard, Y, JYM;
	var S, M;
	var idcard_array = new Array();
	idcard_array = idcard.split("");

	if (area[parseInt(idcard.substr(0, 2))] == null) {
		return false;
	}

	switch (idcard.length) {
		case 15 :
			if ((parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0 || ((parseInt(idcard.substr(6, 2)) + 1900) % 100 == 0 && (parseInt(idcard.substr(6, 2)) + 1900) % 4 == 0)) {
				ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}$/; // 测试出生日期的合法性
			} else {
				ereg = /^[1-9][0-9]{5}[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}$/; // 测试出生日期的合法性
			}
			if (ereg.test(idcard)) {
				//alert(Errors[0] + "15");
				return true;
			} else {
				return false;
			}
			break;
		case 18 :
			// 18位身份号码检测
			// 出生日期的合法性检查
			// 闰年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))
			// 平年月日:((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))
			if (parseInt(idcard.substr(6, 4)) % 4 == 0 || (parseInt(idcard.substr(6, 4)) % 100 == 0 && parseInt(idcard.substr(6, 4)) % 4 == 0)) {
				ereg = /^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|[1-2][0-9]))[0-9]{3}[0-9Xx]$/; // 闰年出生日期的合法性正则表达式
			} else {
				ereg = /^[1-9][0-9]{5}(19|20)[0-9]{2}((01|03|05|07|08|10|12)(0[1-9]|[1-2][0-9]|3[0-1])|(04|06|09|11)(0[1-9]|[1-2][0-9]|30)|02(0[1-9]|1[0-9]|2[0-8]))[0-9]{3}[0-9Xx]$/; // 平年出生日期的合法性正则表达式
			}
			if (ereg.test(idcard)) { // 测试出生日期的合法性
				// 计算校验位
				S = (parseInt(idcard_array[0]) + parseInt(idcard_array[10])) * 7 + (parseInt(idcard_array[1]) + parseInt(idcard_array[11])) * 9
						+ (parseInt(idcard_array[2]) + parseInt(idcard_array[12])) * 10 + (parseInt(idcard_array[3]) + parseInt(idcard_array[13])) * 5
						+ (parseInt(idcard_array[4]) + parseInt(idcard_array[14])) * 8 + (parseInt(idcard_array[5]) + parseInt(idcard_array[15])) * 4
						+ (parseInt(idcard_array[6]) + parseInt(idcard_array[16])) * 2 + parseInt(idcard_array[7]) * 1 + parseInt(idcard_array[8]) * 6 + parseInt(idcard_array[9])
						* 3;
				Y = S % 11;
				M = "F";
				JYM = "10X98765432";
				M = JYM.substr(Y, 1);
				if (M == idcard_array[17]) {
					//alert(Errors[0] + "18");
					return true;
				} else {
					showErrorMsg(element);
					return true;
				}
			} else {
				return false;
			}
			break;
		default :
			return false;
	}
	return true;
}