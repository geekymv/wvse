
$(function() {
	list();
});

/**
 * list event
 */
function list() {
	$.ajax({
		url: contextPath + "/list.do",
		data: "",
		dataType: "",
		success: function(data) {
			
		}
	});
	
}

