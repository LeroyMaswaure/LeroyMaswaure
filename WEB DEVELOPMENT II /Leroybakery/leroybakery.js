var customername = "Leroy";
var totalPrice = 1150;
document.getElementById("customer-name").innerHTML = customername;
document.getElementById("price").innerHTML = "$" + totalPrice;

var hours = new Date().getHours();
if (hours <= 11) {
    document.getElementById("time").innerHTML = "Good Morning";
} else if (hours <= 16) {
    document.getElementById("time").innerHTML = "Good Afternoon";
} else {
    document.getElementById("time").innerHTML = "Good Evening";
}



var products = [
    "pizza",
    "Croissant",
    "sourdough",
    "Donuts",
    "Hotcross "
];

var price = [40, 10, 20, 80, 1000];