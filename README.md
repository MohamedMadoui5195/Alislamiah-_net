<!DOCTYP

<img src="icon.png" width="70">

<script>
if ('serviceWorker' in navigator) {
  navigator.serviceWorker.register('sw.js');
}
</script>

<!-- مربع القائمة -->

<div style="
position:fixed;
top:10px;
right:10px;
width:60px;
height:60px;
background:#b30d3f;
border-radius:8px;
display:flex;
justify-content:center;
align-items:center;
z-index:1001;
">

<button onclick="openMenu()" style="
font-size:30px;
background:none;
border:none;
color:white;
cursor:pointer;
">
☰
</button>

</div>

<!-- القائمة -->
<div id="menu" style="
height:100%;
width:0;
position:fixed;
top:0;
right:0;
background:#b30d3f;
overflow-x:hidden;
transition:0.4s;
padding-top:60px;
z-index:1000;
">

<a href="javascript:void(0)"
onclick="closeMenu()"
style="
position:absolute;
top:10px;
left:15px;
font-size:35px;
color:white;
text-decoration:none;
">
×
</a>

<!-- منصاتنا -->
<button onclick="togglePlatforms()" style="
width:100%;
padding:15px;
font-size:22px;
background:none;
border:none;
color:white;
text-align:right;
cursor:pointer;
">
📱 منصاتنا ▼
</button>

<div id="platforms" style="display:none;">

<a href="https://www.tiktok.com/@user31912672754551?_r=1&_t=ZS-96bCnHsMDCa"
target="_blank"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
تيك توك
</a>

<a href="https://youtube.com/@alislamiah5195?si=8GwSs2q4DnD-JOMf"
target="_blank"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
يوتيوب
</a>

<a href="https://whatsapp.com/channel/0029VbCd4APEawdpGuhPeA0G"
target="_blank"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
واتساب
</a>

<a href="https://t.me/alislamiahmo45"
target="_blank"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
تيليجرام
</a>

</div>

<!-- دروسنا -->
<button onclick="toggleLessons()" style="
width:100%;
padding:15px;
font-size:22px;
background:none;
border:none;
color:white;
text-align:right;
cursor:pointer;
">
📚 دروسنا ▼
</button>

<div id="lessons" style="display:none;">

<a href="#lesson1"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
If Conditional
</a>

<a href="#lesson2"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
Despite and Inspite Of
</a>

<a href="#lesson3"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
Linking Words
</a>

<a href="#lesson4"
style="display:block;padding:12px 30px;color:white;text-decoration:none;">
Tenses
</a>

</div>

<!-- الخلفية -->
<button onclick="toggleBackgrounds()" style="
width:100%;
padding:15px;
font-size:22px;
background:none;
border:none;
color:white;
text-align:right;
cursor:pointer;
">
🎨 الخلفية ▼
</button>

<div id="backgrounds" style="display:none;">

<button onclick="whiteTheme()" style="
width:100%;
padding:12px 30px;
background:none;
border:none;
color:white;
text-align:right;
cursor:pointer;
font-size:18px;
">
⚪ أبيض
</button>

<button onclick="blueTheme()" style="
width:100%;
padding:12px 30px;
background:none;
border:none;
color:white;
text-align:right;
cursor:pointer;
font-size:18px;
">
🔵 أزرق داكن
</button>



</div>

<!-- حقوق النشر -->
<div style="
position:absolute;
bottom:20px;
width:100%;
text-align:center;
color:white;
font-size:14px;
">
© جميع حقوق النشر محفوظة لدى الإسلامية
</div>

</div>

<script>
function openMenu() {
document.getElementById("menu").style.width = "280px";
}

function closeMenu() {
document.getElementById("menu").style.width = "0";
}

function togglePlatforms() {
var x = document.getElementById("platforms");
if (x.style.display === "block") {
x.style.display = "none";
} else {
x.style.display = "block";
}
}

function toggleLessons() {
var x = document.getElementById("lessons");
if (x.style.display === "block") {
x.style.display = "none";
} else {
x.style.display = "block";
}
}

function toggleBackgrounds() {
var x = document.getElementById("backgrounds");
if (x.style.display === "block") {
x.style.display = "none";
} else {
x.style.display = "block";
}
}

  function whiteTheme() {
document.body.style.backgroundColor = "white";
document.body.style.color = "black";
}

function blueTheme() {
document.body.style.backgroundColor = "#2f3a56";
document.body.style.color = "white";
}
</script>

<div style="  
display:flex;  
overflow-x:auto;  
white-space:nowrap;  
gap:10px;  
background:red;  
padding:15px;  
">  <button onclick="  
document.body.style.background='white';  
document.body.style.color='black';  
"  
style="  
min-width:100px;  
background:none;  
border:none;  
color:white;  
font-size:18px;  
cursor:pointer;  
flex:none;  
">
أبيض
</button>

<button onclick="  
document.body.style.background='#2d3550';  
document.body.style.color='white';  
"  
style="  
min-width:100px;  
background:none;  
border:none;  
color:white;  
font-size:18px;  
cursor:pointer;  
flex:none;  
">
أزرق
</button>

<button onclick="
window.location.href='https://youtube.com/@alislamiah5195?si=9mSLKzXpiq_XVCTN';
" 
style="
min-width:100px;
background:none;
border:none;
color:white;
font-size:18px;
cursor:pointer;
flex:none;
">
يوتيوب
</button>

<button onclick="  
window.location.href='https://whatsapp.com/channel/0029VbCd4APEawdpGuhPeA0G';  
"  
style="  
min-width:100px;  
background:none;  
border:none;  
color:white;  
font-size:18px;  
cursor:pointer;  
flex:none;  
">
واتساب
</button>

<button onclick="  
window.location.href='https://www.tiktok.com/@user31912672754551?_r=1&_t=ZS-96LucWHJg5x';  
"  
style="  
min-width:100px;  
background:none;  
border:none;  
color:white;  
font-size:18px;  
cursor:pointer;  
flex:none;  
">
تيك توك
</button>

<button onclick="  
window.location.href='https://t.me/alislamiahmo45';  
"  
style="  
min-width:100px;  
background:none;  
border:none;  
color:white;  
font-size:18px;  
cursor:pointer;  
;  
">
تيليجرام
</button>

</div>  

<div id="videos">

<video controls width="100%" style="
border-radius:15px;
margin-top:20px;
">
  <source src="IMG_20260526_063459_202.mp4" type="video/mp4">
</video>

<video controls width="100%" style="
border-radius:15px;
margin-top:20px;
">
  <source src="VID_20260528_110617_560.mp4" type="video/mp4">
</video>

<h1>مرحبا بكم في موقعي</h1>

<p>أود أن أتفضل بالتعريف عن هذا الموقع: هذا موقع لعرض 
    الدروس الخصوصية و الدعم في مادة اللغة الإنجليزية لتلاميذ الباكالوريا 

    <style>
body{padding-bottom:80px;}

#bottomNav{
position:fixed;
bottom:0;
left:0;
width:100%;
height:65px;
background:#fff;
display:flex;
justify-content:space-around;
align-items:center;
border-top:1px solid #ddd;
z-index:1000;
}

#searchBox,#ratingBox{
display:none;
position:fixed;
bottom:75px;
left:10px;
right:10px;
background:#fff;
padding:15px;
border-radius:10px;
z-index:2000;
box-shadow:0 0 10px rgba(0,0,0,0.3);
}

#menu{
z-index:99999 !important;
position:fixed;
}

.star{
font-size:30px;
cursor:pointer;
color:#ccc;
}

.star.active{
color:gold;
}
</style>

<div id="bottomNav">

<button onclick="
window.scrollTo({top:0,behavior:'smooth'})
">
🏠الرئيسية
</button>

<button onclick="toggleSearch()">
🔍البحث
</button>

<button onclick="toggleRating()">
⭐قيمنا
</button>

<button onclick="window.location.href='video.html'">
🎥 فيديو
</button>

</div>

<div id="searchBox">

<input id="searchInput"
onkeyup="searchLesson()"
placeholder="بحث..."
style="width:100%;padding:10px;">

<div id="results"></div>

</div>

<div id="ratingBox">

<p>التقييم:</p>

<div id="stars">

<span class="star">★</span>
<span class="star">★</span>
<span class="star">★</span>
<span class="star">★</span>
<span class="star">★</span>

</div>

<p id="ratingText">0/5</p>

</div>

<script>

function toggleSearch(){

document.getElementById("searchBox").style.display=

document.getElementById("searchBox").style.display==="block"

? "none" : "block";

}

function toggleRating(){

document.getElementById("ratingBox").style.display=

document.getElementById("ratingBox").style.display==="block"

? "none" : "block";

}

function searchLesson(){

let input =
document.getElementById("searchInput")
.value.toLowerCase();

let lessons =
document.querySelectorAll("h2,h3");

let results =
document.getElementById("results");

results.innerHTML="";

lessons.forEach(el=>{

if(
el.innerText.toLowerCase().includes(input)
&& input!==""
){

let d=document.createElement("div");

d.innerText="📚 "+el.innerText;

d.style.padding="10px";

d.style.cursor="pointer";

d.onclick=()=>
el.scrollIntoView({behavior:"smooth"});

results.appendChild(d);

}

});

}

let stars=document.querySelectorAll(".star");

let rating=0;

stars.forEach((s,i)=>{

s.onclick=()=>{

rating=i+1;

localStorage.setItem("rating",rating);

document.getElementById("ratingText")
.innerText=rating+"/5";

stars.forEach((x,j)=>
x.classList.toggle("active",j<rating)
);

};

});

</script>

video c<ontrols width="100%" style="
border-radius:15px;
margin-top:20px;
">
  <source src="VID_20260528_110617_560.mp4" type="video/mp4">
</video>

<h2>نماذج شعبة آداب و فلسفة </h2>

<div style="
display:flex;
overflow-x:auto;
white-space:nowrap;
gap:10px;
padding:10px;
background:#f5f5f5;
">

<button onclick="window.open('https://www.dzexams.com/uploads/sujets/officiels/bac/2020/dzexams-bac-anglais-1829145.pdf','_blank')"
style="padding:10px 20px;flex:none;">
نموذج 1
</button>

<button onclick="window.open('https://www.dzexams.com/uploads/sujets/officiels/bac/2021/dzexams-bac-anglais-1402187.pdf','_blank')"
style="padding:10px 20px;flex:none;">
نموذج 2
</button>

<button onclick="window.open('https://www.dzexams.com/uploads/sujets/officiels/bac/2022/dzexams-bac-anglais-1632419.pdf','_blank')"
style="padding:10px 20px;flex:none;">
نموذج 3
</button>

<button onclick="window.open('https://www.dzexams.com/uploads/sujets/officiels/bac/2023/dzexams-bac-anglais-206010.pdf','_blank')"
style="padding:10px 20px;flex:none;">
نموذج 4
</button>

<button onclick="window.open('https://www.dzexams.com/uploads/sujets/officiels/bac/2024/dzexams-bac-anglais-1096571.pdf','_blank')"
style="padding:10px 20px;flex:none;">
نموذج 5
</button>

</div>


<h2>شعبة العلوم التجريبية </h2>


<div style="
display:flex;
justify-content:center;
gap:10px;
padding:15px;
flex-wrap:wrap;
">

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/U0ZGY2VRekl4TG82UlhWZTc3NW93Zz09'">
نموذج 1
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/MWhaY3hYUFRyN0ltMjhUcUZ3c1BQdz09'">
نموذج 2
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/b2xNckxQSyszS01UcVhvZmsrYXozZz09'">
نموذج 3
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/U1oyS2dkMU5kcnN1TzVTZ0FJTjlDQT09'">
نموذج 4
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/Lys1Rk5MOW1sbGxmRXRzUTVjME5OUT09'">
نموذج 5
</button>

</div>



<h2>نماذج شعبة لغات أجنبية </h2>


<div style="
display:flex;
overflow-x:auto;
white-space:nowrap;
gap:10px;
padding:15px;
">

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/WHNGRGtCUm9kS0VBWEpkc3lvMC9nQT09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 1
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/a0ZRWVBKWk9CdFp1a0owbTYyenBSUT09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 2
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/NW1xNW1DZkd5Ry9IMnN5djdmNllmZz09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 3
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/eGN4V1lrelVEeEIzelo3UGpBYlkrQT09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 4
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/eUdYNUJabEYzdDREci85bGxDM3Fzdz09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 5
</button>

<button onclick="window.location.href='https://www.dzexams.com/ar/annales/WUtCOFhUME84OVMzSWEzM3hNN3JuUT09'"
style="flex:none;min-width:120px;padding:10px;">
نموذج 6
</button>

</div>

<h1 style="text-align:center;">
قائمة الدروس
</h1>

<div style="
display:flex;
overflow-x:auto;
white-space:nowrap;
gap:10px;
background:#222;
padding:15px;
">

<button onclick="document.getElementById('lesson1').scrollIntoView();"
style="
min-width:180px;
color:white;
background:none;
border:none;
font-size:18px;
flex:none;
cursor:pointer;
">
Lesson 1
</button>

<button onclick="document.getElementById('lesson2').scrollIntoView();"
style="
min-width:180px;
color:white;
background:none;
border:none;
font-size:18px;
flex:none;
cursor:pointer;
">
Lesson 2
</button>

<button onclick="document.getElementById('lesson3').scrollIntoView();"
style="
min-width:180px;
color:white;
background:none;
border:none;
font-size:18px;
flex:none;
cursor:pointer;
">
Lesson 3
</button>

<button onclick="document.getElementById('lesson4').scrollIntoView();"
style="
min-width:180px;
color:white;
background:none;
border:none;
font-size:18px;
flex:none;
cursor:pointer;
">
Lesson 4
</button>

</div>

<div style="
display:flex;
justify-content:center;
align-items:center;
min-height:100vh;
font-family:Arial;
background:linear-gradient(135deg,#0f172a,#1e293b);
color:white;
text-align:center;
">

<div style="
background:rgba(255,255,255,0.06);
padding:30px;
border-radius:20px;
max-width:450px;
width:90%;
box-shadow:0 10px 30px rgba(0,0,0,0.4);
">

<h1 style="
margin-bottom:15px;
font-size:28px;
">
تطبيق Alislamiah APK
</h1>

<p style="
font-size:18px;
line-height:1.8;
margin-bottom:25px;
">
بإمكانكم تحميل تطبيق Alislamiah APK<br>
على هواتفكم
</p>

<button onclick="window.location.href='https://drive.google.com/uc?export=download&id=15hOi8LjfDD9S1SXmFeA4IGVksbpbz3nD'"
style="
padding:15px 30px;
background:#22c55e;
color:white;
border:none;
border-radius:12px;
font-size:18px;
cursor:pointer;
font-weight:bold;
">
تحميل التطبيق
</button>

<div style="
margin-top:30px;
font-size:14px;
opacity:0.8;
">
جميع الحقوق محفوظة لشبكة الإسلامية ©
</div>

</div>

</div>

  </div></div>

<div id="stats-box" style="
background:#071a3d;
padding:50px;
border-radius:20px;
margin:20px;
text-align:center;
">

<h2 style="
color:white;
font-size:40px;
margin-bottom:30px;
">
إحصائياتنا
</h2>

<div style="
display:flex;
justify-content:center;
gap:30px;
flex-wrap:wrap;
">

<!-- YouTube -->
<div style="
background:rgba(255,255,255,0.08);
width:280px;
padding:30px;
border-radius:20px;
">

<img
src="https://upload.wikimedia.org/wikipedia/commons/e/ef/Youtube_logo.png"
style="
width:90px;
margin-bottom:15px;
">

<div id="youtube" style="
color:white;
font-size:60px;
font-weight:bold;
">
0
</div>

<div style="
color:white;
font-size:28px;
">
مشترك
</div>

</div>

<!-- TikTok -->
<div style="
background:rgba(255,255,255,0.08);
width:280px;
padding:30px;
border-radius:20px;
">

<img src="https://cdn-icons-png.flaticon.com/512/3046/3046121.png"
width="80">

<div id="tiktok" style="
color:white;
font-size:60px;
font-weight:bold;
">
0
</div>

<div style="
color:white;
font-size:28px;
">
متابع
</div>

</div>

</div>
</div>

<script>
let started = false;

function startCounters() {

if(started) return;
started = true;

let yt = 0;
let tt = 0;

let y = setInterval(function(){

yt += 20;

if(yt >=  2500 أكثر من ){
yt = 2500 أكثر من ;
clearInterval(y);
}

document.getElementById("youtube").innerHTML = yt;

},20);

let t = setInterval(function(){

tt += 2;

if(tt >= أكثر من 250){
tt = أكثر من 250;
clearInterval(t);
}

document.getElementById("tiktok").innerHTML = tt;

},30);

}

window.addEventListener("scroll", function(){

let box = document.getElementById("stats-box");

if(
box.getBoundingClientRect().top <
window.innerHeight - 100
){
startCounters();
}

});
</script>



<h2 id="lesson1">
Lesson one: if conditional
</h2>

<h2>Lesson 1: If conditional</h2>

<p>I look</p>

<p><b>Mohamed:</b> what will you wear tomorrow?</p>

<p><b>Abdel Malik:</b> I will wear a jacket because it's rainy and the weather is very cold ❄️🥶</p>

<h3>The rule:</h3>

<p>There are four types of the conditional</p>

<h3>First: type 0</h3>

<p>It's used to explain scientific facts and everything here happens 100%.</p>

<p>Example: If it is hot, ice melts.</p>

<p>In this type we use the present simple in both sentences.</p>

<h3>Second: type 1</h3>

<p>This type talks about something possible in the future (about 80%).</p>

<p>Example: If you work hard, you will succeed.</p>

<p>In this type we use the present simple after if and the future simple in the second sentence.</p>

<h3>Third: type 2</h3>

<p>This type talks about unreal or imaginary situations.</p>

<p>Example: If I were you, I would open the store.</p>

<p>In this type we use the past simple in the first sentence and would + verb in the second sentence.</p>

<h3>Fourth: type 3</h3>

<p>This type talks about impossible situations in the past.</p>

<p>Example: If this player had played with us, we would have won the match.</p>

<h3>Unless</h3>

<p>We use it like if, but it means if not.</p>

<p>Example:</p>

<p>If you work hard, you won't fail.</p>

<p>Unless you work hard, you will fail.</p>

<p>That's all in this lesson.</p>

<h2 id="lesson2">
Despite and inspite of
</h2>

<h2>Lesson 2: Despite and In spite of</h2>

<p>
Despite and In spite of mean:
(رغم / بالرغم من)
</p>

<h3>Rule:</h3>

<p>
After Despite / In spite of, the verb becomes ING.
</p>

<p>
Play → Playing
</p>

<p>
Eat → Eating
</p>

<p>
Win → Winning
</p>

<h3>Example:</h3>

<p>
Algeria won vs Argentina. Messi is number one.
</p>

<p>
Despite Algeria winning vs Argentina, Messi is number one.
</p>

<p>
The same with In spite of.
</p>

<h3>Similar words:</h3>

<p>
Although
</p>

<p>
Though
</p>

<p>
However
</p>

<p>
These words have similar meanings but the verb stays normal.
</p>

<h3>Example:</h3>

<p>
This city is freezing 🥶, I enjoyed it though.
</p>

<h2 id="lesson3">
Linking words
</h2>

<h2>Lesson 3: Linking words</h2>

<p>
Linking words are words used to connect ideas.
</p>

<h3>1. Addition</h3>

<p>
and
</p>

<p>
also
</p>

<p>
in addition
</p>

<p>
moreover
</p>

<p>
Example: I study and I work.
</p>

<p>
Moreover, I exercise daily.
</p>

<h3>2. Cause</h3>

<p>
because
</p>

<p>
since
</p>

<p>
as
</p>

<p>
Example: I stayed home because it rained.
</p>

<h3>3. Result</h3>

<p>
so
</p>

<p>
therefore
</p>

<p>
as a result
</p>

<p>
Example: It was late, so I slept.
</p>

<h3>4. Contrast</h3>

<p>
but
</p>

<p>
however
</p>

<p>
although
</p>

<p>
despite
</p>

<p>
Example: I am tired, but I will work.
</p>

<p>
However, I agreed.
</p>

<h3>5. Sequence</h3>

<p>
first
</p>

<p>
then
</p>

<p>
after that
</p>

<p>
finally
</p>

<p>
Example: First, I wake up. Then I study.
</p>


<h2 id="lesson4">
Tenses
</h2>

<h3>1. Present simple</h3>

<p>
I / You / We / They → verb
</p>

<p>
He / She / It → verb + s
</p>

<p>
Example: I wake up early.
</p>

<h3>Verbs ending with:</h3>

<p>
x / o / s / ss / sh / ch
</p>

<p>
He / She / It → verb + es
</p>

<h3>Verbs ending with y</h3>

<p>
If there is a vowel before y:
</p>

<p>
play → plays
</p>

<p>
If there is a consonant before y:
</p>

<p>
study → studies
</p>

<h3>2. Future simple</h3>

<p>
Will + verb
</p>

<h3>3. Past simple</h3>

<p>
Regular verbs:
verb + ed
</p>

<p>
Irregular verbs:
special forms
</p>

<h3>4. Present perfect</h3>

<p>
Have / Has + past participle
</p>

<p>
Regular verbs:
verb + ed
</p>

<h2>PAST PERFECT</h2>

<p>
To form the past perfect: had + past participle
</p>

<h3>IRREGULAR VERBS</h3>

<p>
In the past simple and the past participle there are some irregular verbs such as:
</p>

<p>Write ✍️ → Wrote → Written</p>
<p>Sleep → Slept → Slept</p>
<p>Eat → Ate → Eaten</p>

<h3>5. Present continuous</h3>

<p>
To be + verb + ing
</p>

<h3>6. Past continuous</h3>

<p>
Was / Were + verb + ing
</p>
