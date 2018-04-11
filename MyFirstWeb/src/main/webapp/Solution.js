 
 $(document).ready(function () {
  var a = document.table.A.value;
    var b = document.table.B.value;
    var c = document.table.C.value;

     var coeff = {
         A: a,
         B: b,
         C: c
     };
     var json = JSON.stringify(coeff);
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
    }
 }
