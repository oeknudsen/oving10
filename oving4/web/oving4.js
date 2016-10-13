/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var posH = 0;
var posW = 0;

$(document).ready(function() {
    $('#oving4').mouseover(function() {
        newPos();
        $('#oving4').animate({
            left: posH,
            top: posW 
        }),1000;
    });
    
    $('#oving4').click(function() {
        $('#oving4').stop();
        $('#oving4').fadeOut();
    });
});

function newPos() {
    posH = Math.random() * window.innerHeight;
    posW = Math.random() * window.innerWidth;
}