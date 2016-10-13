/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var el = document.getElementsByTagName("div");
var christmas = new Date(2016, 11, 24);
var today = new Date(); //2. september
var oneToThree = new Date(2016, 09, 10); //10. oktober
var one = new Date(2016, 11, 13); //13. desember
var daysToChristmas = Math.ceil((christmas.getTime() - today.getTime()) / 86400000);
var date = today.getDate();
var month = today.getMonth() + 1;
var year = today.getFullYear();

function getDate() {
    if(daysToChristmas > 90) {
        el[1].className = "threeMonths";
    } 
    else if(30 < daysToChristmas < 90) {
        el[1].className = "oneToThreeMonths";
    } 
    if(daysToChristmas < 30) {
        el[1].className = "lessThenAMonth";
    }
    el[0].innerHTML = "Dagens dato: " + date + "." + month + "." + year;
    el[1].innerHTML = "Antall dager til jul: " + daysToChristmas.toFixed(0);  
}

