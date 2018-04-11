$(document).ready(function () {
    var a = document.getElementById("A").value;
    var b = document.getElementById("B").value;
    var c = document.getElementById("C").value;

    var json = JSON.stringify({
         A: a,
         B: b,
         C: c
    });

     $('#form').submit((event) => {
         $.ajax({
         url: 'http://localhost:8081/solution',
         datatype: 'json',
         type: 'post',
         contentType: 'application/json',
         data: json,
         success: function (data) {
             var solution = document.getElementById("square_solution");
             solution.innerHTML = data;
         }
            })
        });
 })