<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my project</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>


<div class="main">
<div class="first"> 

<form action="saving" method="post">
	 
	 <label for="firstA">First coordinates:</label> 
	 
	 <br> 
	 
	 <input id="firstA" type="number" min="0" step="1"  name="firstA" > ${firstA}
	 
	 <label for="firstB"></label> 
	 
	 <input id="firstB" type="number" min="0" step="1" name="firstB"  size="4" > ${firstB}
	 
	 <br>
	 
	 <label for="secondA" >Second coordinates:</label> <br>
	 
	 <input id="secondA" type="number" min="0" step="1" name="secondA"  size="4" > ${secondA}
	 
	 <label for="secondB" ></label>
	 
	 <input id="secondB"type="number" min="0" step="1" name="secondB"  size="4"  > ${secondB}
	 
	 <br>
	 
	 <label for="thirdA">Third coordinates:</label>
	 <br>
	 <input id="thirdA" type="number" min="0" step="1" name="thirdA"  size="4" > ${thirdA}
	 
	 <label for="thirdB"></label>
	 
	 <input id="thirdB" type="number" min="0" step="1" name="thirdB"  size="4" > ${thirdB}
	 <br>
	 
	 <label for="fourthA">Fourth coordinates:</label>
	 <br>
	 <input id="fourthA" type="number" min="0" step="1" name="fourthA"  size="4" > ${fourthA}
	 
	 <label for="fourthB"></label>
	 
	 <input id="fourthB" type="number" min="0" step="1" name="fourthB"  size="4" > ${fourthB}
	 <br> 
	 
	 
	 <input type="button" value="Draw" onclick="draw()"> 
	 <br>
	 <input type="submit" value="Save">
	 
 	</form>



</div>
<div class="canvasDiv">
<canvas></canvas>
</div>

		<div class="search">
		<form action="drawDBCoordinats" method="get">
			<label for="r">Enter object id:</label> 
			<br> 
			<input	id="" type="number" min="0" step="1" name="savedCoordinates">
		    <input type="submit" value="Search">
		</form>
		</div>

	</div>
<script src="javaScript/javascript.js"></script>
</body>
</html>