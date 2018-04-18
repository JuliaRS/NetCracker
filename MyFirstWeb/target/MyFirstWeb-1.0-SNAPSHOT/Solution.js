$(document).ready(function () {
    $('#form').on("click", function(event){
         event.preventDefault();
         var a = document.getElementById("A").value;
         var b = document.getElementById("B").value;
         var c = document.getElementById("C").value;
         $("table tr:odd").not("thead tr").addClass("odd_row");
         $("table tr:even").not("thead tr").addClass("even_row");
         $.ajax({
         url: 'http://localhost:8081/solution',
         datatype: 'json',
         type: 'GET',
         data: ({"A": a, "B": b,"C": c}),
         contentType: 'application/json',
         success: function (data) {
             var solution = document.getElementById("square_solution");
             solution.innerHTML = data.data;
             table.appendTableColumn(table.parseData({equation: [a, b, c], answer: data.data}), true);
         },
         error: function(xhr,status,error){
             alert(xhr.responseText+'|'+status+'|'+error);
         }
            })
    });
 })