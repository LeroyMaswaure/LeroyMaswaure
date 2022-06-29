var calender = {
    header: "<tr><th>S</th><th>M</th><th>T</th><th>W</th><th>Th</th><th>F</th><th>Sat</th></tr><tr>",
    displayCalender: function() {
        var ele = document.getElementById("calender");
        var calenderText = "<table class = 'table table-condensed'>";
        calenderText += this.header;
        for (var i = 1; i <= 31; i++) {
            //write code to display date
        }
        calenderText += "</table>"
        ele.innerHTML = calenderText;
    }
}
calender.displayCalender();