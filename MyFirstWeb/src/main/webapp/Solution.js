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
    };
     /*
     var xhr = new XMLHttpRequest();
     xhr.open("POST", '/solution', true)
     xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
     xhr.onreadystatechange =function () {
         // встраиваем функцию проверки статуса нашего запроса
         // это вызывается при каждом изменении статуса
         if (httpRequest.readyState === 4 && httpRequest.status === 200) {
             callback.call(httpRequest.responseXML); // вызываем колбек
         }
     }
     xhr.send(json);
     var solution = document.getElementById("square_solution");
     var response = xhr.getAllResponseHeaders();
     solution.innerHTML = response;*/

}
