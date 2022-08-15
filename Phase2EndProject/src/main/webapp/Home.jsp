<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2>Welcome to Home Page ${sessionScope.obj} </h2>
<h3>Select Required Option</h3>
<a href="storeTrainer.jsp">Add Trainer Details</a> <br/>
<hr/>
<a href="TrainerController">View All Trainer Details</a> <br/>
<hr/>
<a href="storeStudent.jsp">Add Student Details</a> <br/>
<hr/>
<a href="StudentsController">View All Student Details</a> <br/>
<hr/>
<a href="storeSubject.jsp">Add Subject Details</a> <br/>
<hr/>
<a href="SubjectsController">View All Subject Details</a> <br/>
<hr/>
<a href="storeClass.jsp">Add Class Details</a> <br/>
<hr/>
<a href="ClassesController">View All Class Details</a> <br/>
<hr/>
<a href="assignTrainertoStudent.jsp">Assign Trainer to Student</a> <br/>
<hr/>
<a href="assignTrainertoSubject.jsp">Assign Trainer to Subject</a> <br/>
<hr/>
<a href="ViewTrainerandStudents">View Students and Assigned Trainer</a> <br/>
<hr/>
<a href="ViewTrainerandSubjects">View Subjects and Assigned Trainer</a> <br/>
<hr/>

</body>
</html>