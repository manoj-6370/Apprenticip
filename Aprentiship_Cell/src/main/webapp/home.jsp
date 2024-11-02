<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apprentiship Cell</title>
	<link rel="stylesheet" href="bs-css/bootstrap.min.css">
	<link rel="stylesheet" href="fa-css/all.min.css">
	<link rel="stylesheet" href="styles.css">
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-info">
        <div class="container">
            <a class="navbar-brand" href="#"><h3><b>Apprentiship Cell</b></h3></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item me-5">
                        <a class="btn butt btn-outline-secondary active" aria-current="page" href="#"><h5><b>Home</b></h5></a>
                    </li>
                    <li class="nav-item me-5">
                        <a class="btn butt btn-outline-secondary" href="#"><h5><b>Trainee</b></h5></a>
                    </li>
                    <li class="nav-item me-5">
                        <a class="btn butt btn-outline-secondary" href="#"><h5><b>Application Form</b></h5></a>
                    </li>
                    <li class="nav-item">
                        <a class="btn butt btn-outline-secondary" href="fetchGenInstruction.htm"><h5><b>General Instruction</b></h5></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Content Section -->
    <div class="container col-8 mt-5">
    	<div class="text-center"><h2 class="mb-4"><b>Members List</b></h2></div>
       <table class="table table-bordered custom-table">
		  <thead>
		    <tr class="table-primary">
		      <th class="text-center"><h5><b>Primary Role</b></h5></th>
		      <th class="text-center"><h5><b>Members</b></h5></th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr class="table-warning">
		    	<td class="text-center"><h5><b>Team Leader</b></h5></td>
		    	<td class="text-center"><h5><b>Prakash Babu V R, ScF</b></h5></td>
		    </tr>
		    <tr class="table-secondary">
		    	<td class="text-center"><h5><b>Team Coordinator</b></h5></td>
		    	<td class="text-center"><h5><b>Sachin Kumar, ScE<br>Sasi Kumar, ScE<br>Roshan Kumar, TOA</b></h5></td>
		    </tr>
		  </tbody>
		</table>
    </div>

	<script src="bs-js/bootstrap.min.js"></script>
	<script src="fa-js/fontawesome.min.js"></script>
	</body>
</html>
