
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