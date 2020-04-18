<?php 

// For ile çarpım tablosu
for($i=1;$i<=10;$i++){
    for($j=1;$j<=10;$j++){
        echo $i*$j."\t";
    }
    echo "\n";
}

// While ile çarpım tablosu
$sayX = 1;
$sayY = 1;
while($sayX<=10){
    while($sayY<=10){
        echo $sayX*$sayY;
        $sayY++;
        echo "\t";
    }
    echo "\n";
    $sayX++;
    $sayY =$sayY-10;
}

// Foreach ile çarpım tablosu
$x = [1,2,3,4,5,6,7,8,9,10];
$y = [1,2,3,4,5,6,7,8,9,10];
foreach ($x as $kx => $vx) {
    foreach ($y as $ky => $vy) {
        echo $vx*$vy."\t";
    }
    echo "\n";
}

?>
