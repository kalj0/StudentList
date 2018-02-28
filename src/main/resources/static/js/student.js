
$(document).ready(function(){

	let id = getUrlParameter('id');
	if (id) {
		$('#see-student').hide();
	} else {
		$('#student-form').hide();
	}

	function getUrlParameter(name) {
		let param = location.search.substring(1).split('&').find(query => query.split('=')[0] == name);
		if (param)
			return param.split('=')[1];
		return null;
	}

	function getStudents() {
		$.get({
			url: 'http://localhost:8080/students',
			success: (data) => console.log(data)
		});
		
	}

	function getStudentById(){

		$.get({
			url: 'http://localhost:8080/students/' + $('#id-student').val(),
			success: (data) => $('#student').text(data.name)
		})
	}


});