let canvas = document.querySelector('canvas');

// canvas.width = windows.innerWidth;
// canvas.heigt = windows.innerHeight;

var contex = canvas.getContext('2d');


//line
function draw(){

	let firstA = document.getElementById("firstA").value;
	let firstB = document.getElementById("firstB").value;

	let secondA = document.getElementById("secondA").value;
	let secondB = document.getElementById("secondB").value;

	let thirdA = document.getElementById("thirdA").value;
	let thirdB = document.getElementById("thirdB").value;

	let fourthA = document.getElementById("fourthA").value;
	let fourthB = document.getElementById("fourthB").value;
	
		
	contex.beginPath();
	contex.moveTo(10, 10);
	contex.lineTo(firstA, firstB);
	contex.lineTo(secondA, secondB);
	contex.lineTo(thirdA, thirdB);
	contex.lineTo(fourthA, fourthB);
	contex.stroke();	
}
