"use strict";
var auth = auth || {};
auth =(()=>{
	const WHEN_ERR = '호출하는 JS를 찾을수 없습니다.'
	let _, js;
	
	let init =()=>{
		_ = $.ctx();
		js= $.js();
		
	}
	let onCreate =()=>{
		init();
		$('#a_go_join').dblclick(()=>{
			alert('회원가입 클릭 !! ');
		});
	}
	return{onCreate:onCreate}
	
})();