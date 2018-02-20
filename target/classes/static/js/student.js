

function getStudents() {
	$.get({
		url: 'http://localhost:8080/students',
		success: (data) => console.log(data)
	});
}