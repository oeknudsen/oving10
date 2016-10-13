/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var img = new Image();
var div = document.getElementById('1');

img.onload = function() {
  div.appendChild(img);   
};

function mouseOver() {
    img.src = 'http://cdn.images.express.co.uk/img/dynamic/20/590x/Game-of-Thrones-584275.jpg';
}

function mouseOut() {
    img.src = 'http://www.thewrap.com/wp-content/uploads/2016/06/iron-throne.jpg';
}

img.src = 'http://www.thewrap.com/wp-content/uploads/2016/06/iron-throne.jpg';
