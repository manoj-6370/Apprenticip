<%@page import="com.example.AprentishipCell.Entity.GeneralInstruction"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apprentiship Cell</title>
	<link rel="stylesheet" href="bs-css/bootstrap.min.css">
	<link rel="stylesheet" href="fa-css/all.css">
	<link rel="stylesheet" href="styles.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
                        <a class="btn butt btn-outline-secondary" aria-current="page" href="/AprentishipCell"><h5><b></i>Home</b></h5></a>
                    </li>
                    <li class="nav-item me-5">
                        <a class="btn butt btn-outline-secondary" href="#"><h5><b>Trainee</b></h5></a>
                    </li>
                    <li class="nav-item me-5">
                        <a class="btn butt btn-outline-secondary" href="#"><h5><b>Application Form</b></h5></a>
                    </li>
                    <li class="nav-item">
                        <a class="btn butt btn-outline-secondary active" href="#"><h5><b>General Instruction</b></h5></a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Content Section -->
    <div class="container col-8 mt-5">
    	<div class="text-center"><h2 class="mb-4"><b>General Instruction</b></h2></div>
       <table class="table table-bordered custom-table">
		  <thead>
		    <tr class="table-primary">
		      <th class="text-center" style="width: 10%;"><h5><b>Sl No.</b></h5></th>
		      <th class="text-center"><h5><b>Instruction</b></h5></th>
		      <th class="text-center" style="width: 15%;"><h5><b>Action</b></h5></th>
		    </tr>
		  </thead>
		  <tbody>
		  <% 
		  List<GeneralInstruction> genInstructions = (List<GeneralInstruction>) request.getAttribute("Instructions");
		  int i = 1;
		  if(genInstructions != null){
		  for(GeneralInstruction gi : genInstructions){
		  %>
		    <tr class="table-warning">
		    	<td class="" style="width: 10%;"><h5><b><%= i++ %></b></h5></td>
		    	<td style="text-align: justify;"><h5><b><%= gi.getGenIstrName() %></b></h5></td>
		    	<td class="text-center">
                    <a href="editInstruction?id=<%= gi.getGenIstrId() %>" class="text-primary me-2"><i class="fa fa-edit"></i></a>
                    <a href="deleteInstruction?id=<%= gi.getGenIstrId() %>" class="text-danger"><i class="fa fa-trash"></i></a>
                </td>
		    </tr>
		    
		  <% }}else{ %> 
		  	<tr class="table-warning">
		    	<td colspan="2" class="text-center"><h5><b>No data Found</b></h5></td>
		    </tr>
		  <% } %> 
		  </tbody>
		</table>
    </div>

    <div class="text-center mt-3">
        <button class="btn butt btn-lg btn-outline-dark" data-bs-toggle="modal" data-bs-target="#instructionsModal">
            <h5><b>Add Instruction</b></h5>
        </button>
    </div>

    <!-- Modal for Adding Instruction -->
    <div class="modal fade" id="instructionsModal" tabindex="-1" aria-labelledby="instructionsModalLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header bg-danger text-white text-center">
                    <h4 class="modal-title" id="instructionsModalLabel"><b>Add Instruction</b></h4>
                    <button type="button" class="btn-close butt" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form id="instructionForm" action="/addGenInstruction" method="post">
                        <div class="mb-3">
                            <label for="instructionInput" class="form-label"><b>Enter Instruction</b></label>
                            <input type="text" id="instructionInput" name="instruction" placeholder="Type your instruction here" class="form-control" required>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn butt btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="submit" class="btn butt btn-primary">Save Instruction</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="bs-js/bootstrap.min.js"></script>
    <script src="fa-js/fontawesome.min.js"></script>
	</body>
</html>
