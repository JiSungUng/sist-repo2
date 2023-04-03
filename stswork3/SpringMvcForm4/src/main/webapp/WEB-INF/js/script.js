/**
 * 
 */

$(function(){
	//초기이미지
	$("#myimg").attr("src","../image/15.png")
	
	//이벤트
	$("#myimg").hover(function(){
		$(this).attr("src","../image/16.png")
	}),function(){
		$(this).attr("src","../image/15.png");
	}
});