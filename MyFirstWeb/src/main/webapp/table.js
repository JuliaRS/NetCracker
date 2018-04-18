var table = {


    length: 0,

    appendTableColumn: function (rowData, save) {
        if (rowData) {
            var lastRow = $('<tr/>').appendTo($('#table').find('tbody:last'));
            $.each(rowData, function (colIndex, c) {
                lastRow.append($('<td />').text(c));
            });
            rowData.number = this.length;
            this.length++;
            if (save) {
                this.toLocalStorage(rowData);
            }
        }
    },



    loadData: function () {
        for (var i = 0; i < localStorage.length + 1; i++) {
            var equation = function() {
                var result = '';


            if (localStorage.getItem(i)) {
                var locationEquation = JSON.parse(localStorage.getItem(i)).equation;
                if (locationEquation && JSON.parse(localStorage.getItem(i)).answer) {
                    result += locationEquation[0] + 'x ^ 2' + (Math.sign(locationEquation[1]) === -1 ? '' : ' + ');
                    result += locationEquation[1] + 'x' + (Math.sign(locationEquation[2]) === -1 ? '' : ' + ');
                    result += locationEquation[2];

                    return { number: i, equation: result, root_1: JSON.parse(localStorage.getItem(i)).answer[0], root_2: JSON.parse(localStorage.getItem(i)).answer[1] };
                }
            }
        };

            this.appendTableColumn(equation, false);


        }
    },

    parseData(data) {

        if (data && data.equation && data.answer) {
            var result = '';
            var coeffs = data.equation;
            result += coeffs[0] + 'x ^ 2' + (Math.sign(coeffs[1]) === -1 ? ' - ' : ' + ');
            result += coeffs[1] + 'x' + (Math.sign(coeffs[2]) === -1 ? ' - ' : ' + ');
            result += coeffs[2];
            return { number: this.length, equation: result, solution: data.answer };
        }
    },

    toLocalStorage: function (data) {
        localStorage.setItem(data.number, JSON.stringify({ equation: data.equation, answer: data.solution }));
    },

    deleteFromLocalStorage: function (index) {
        localStorage.removeItem(index);
    }
}

$('#table').ready(function () {
    table.loadData();

    $('#table tr').click(function () {
        var index = parseInt($(this).find("td:first").html());
        if ((index || index === 0) && (index >= 0 && index <= table.length)) {
            table.deleteFromLocalStorage(index);
            $(this).remove();
        }
    });
});