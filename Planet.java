class Planet {
constructor(radius, distance, orbitspeed, angle) {
this.radius = radius;
this.distance = distance;
this.orbitspeed = orbitspeed;
this.angle = angle;
this.planets = [];
}

orbit() {
this.angle += this.orbitspeed;
for (let i in this.planets) {
this.planets[i].orbit();
}
}

spawnMoons(total, level) {
for (let i = 0; i < total; i++) {
let r = this.radius / (level * 2);
let d = random(50, 150);
let o = random(-0.1, 0.1);
let a = random(TWO_PI);
this.planets.push(new Planet(r, d / level, o, a));
if (level < 3) {
let num = Math.floor(random(0, 4));
this.planets[i].spawnMoons(num, level + 1);
}
}
}

show() {
push();
fill(255, 100);
rotate(this.angle);
translate(this.distance, 0);
ellipse(0, 0, this.radius * 2);
for (let i in this.planets) {
this.planets[i].show();
}
pop();
}
}


----------------------------- sketch.js --------------------

// port of Daniel Shiffman's pde SolarSystemGenerator by madacoo

function setup() {
createCanvas(600, 600);
sun = new Planet(50, 0, 0, random(TWO_PI));
sun.spawnMoons(5, 1);
}

function draw() {
background(51);
translate(width / 2, height / 2);
sun.show();
sun.orbit();
}

------------ index.html -----------------
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Solar System Generator</title>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/p5@1.4.0/lib/p5.min.js"></script>
  
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/p5@1.4.0/lib/addons/p5.sound.min.js"></script>
<script type="text/javascript" src="sketch.js"></script>
<script type="text/javascript" src="planet.js"></script>
</head>
<body>
</body>
</html>