$(document).ready(function () {
    var a = document.getElementById("A").value;
    var b = document.getElementById("B").value;
    var c = document.getElementById("C").value;

     $('#form').submit((event) => {
         $.ajax({
         url: 'http://localhost:8081/solution',
         datatype: 'json',
         type: 'post',
         data: JSON.stringify({"A": a, "B": b, "C": c}),
         contentType: 'application/json',
         success: function (data) {
             var solution = document.getElementById("square_solution");
             solution.innerHTML = data;
         }
            })
        });
 })