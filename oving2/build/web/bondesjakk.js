/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var tds = document.getElementsByTagName("td");

function singleClick(id) {
    if(tds[id].className === "tabellrute") {
        tds[id].className = "playerRed";
    } 
    else {
        tds[id].className = "tabellrute";
    }
}

function doubleClick(id) {
    if(tds[id].className === "tabellrute") {
        tds[id].className = "playerGreen";
    } 
    else {
        tds[id].className = "tabellrute";
    }
}

