var word = prompt("Welcome to Hangman! Player 1," +
"please enter a word for Player 2 to guess.").toUpperCase();

// note the switch toUpperCase(), we want to always work in upper
// case letters to avoid confusing 'a' and 'A' as unequal.
var revealedLetters = new Array(word.length);

for(let i=0;i<revealedLetters.length;i++){
    revealedLetters[i] = word.indexOf(i);
}
// creates an array with as many elements as word has characters.
// Each index of revealedLetters will correspond to a character 
// in word, and if revealedLetters[n] is truthy, then word[n] 
// has been correctly guessed.

revealedLetters.fill(false);

const maxStrikes = 6; 

var strikes = 0;
// the number of incorrect guesses made so far

var strikeLetters = new Array(maxStrikes); 
// this will contain every letter that has been 
// incorrectly guessed.
 drawWordProgress();
 drawGallows();
 
// run this now, to draw the empty word at the start of the game.


// Manipulates the DOM to write all the strike letters to the
// appropriate section in hangman.html
function drawStrikeLetters() {
    // your DOM manipulation code here should create a String 
    // from strikeLetters and put that into the content of some 
    // elementvar wrongLetters = "";
    for(let i =0;i<strikeLetters.length;i++){
        wrongLetters += strikeLetters[i];
    }
    console.log(wrongLetters);
    let strikeArea = document.getElementById("strikes");
    let nameElement = document.createElement("h3");
    
    nameElement.innerHTML(wrongLetters);

    strikeArea.appendChild(nameElement);
}

// document.getElementById("").addEventListener("submit",);



// Manipulates the DOM to write the successfully guessed
// letters of the word, replacing them with dashes 
// if not yet guessed

function drawWordProgress() {
    // your DOM manipulation code here
    // should iterate over revealedLetters, and if the value at
    // each index is truthy, print the corresponding letter from
    // word. Otherwise, it should print a -.
    for(let i=0; i<revealedLetters.length;i++){
        if(revealedLetters[i] == revealedLetters.fill(true)){
            revealedLetters[i] = word.indexOf(i);
            console.log(revealedLetters[i]);
            let wordToGuess = document.getElementById("wordToSolve");
            let nameElementH3 = document.createElement("h3");
            nameElementH3.innerHTML=revealedLetters[i];
            wordToGuess.appendChild(nameElementH3);
        }else{
            revealedLetters[i]= "-";
            console.log(revealedLetters[i]);
            let wordToGuess = document.getElementById("wordToSolve");
            let nameElementH3 = document.createElement("h3");
            nameElementH3.innerHTML=revealedLetters[i];
            wordToGuess.appendChild(nameElementH3);
        }

        console.log("Another Dash or Letter");
    }
    console.log("Draw word progress Drawn");
}

// Manipulates the DOM to update the image of the gallows for 
// the current game state.
function drawGallows() { 
    console.log("Drawing the gallows");
    // your DOM manipulation code here 
    // should update an <img> element in the appropriate
    //  hangman.html section to point to 
    // "images/strike-"+strikes+".png"
    while(strikes < maxStrikes){
        let gallows = document.getElementById("gallows");
        let gallowsIMG = document.createElement("img");
        gallowsIMG.src = "images/strike-"+strikes+".png";
        gallows.appendChild(gallowsIMG);
        break;
    }
}
function processGuess(event) {
    event.preventDefault(); 
    let guess = document.getElementById("guessLetter").value;
    guess = guess.toUpperCase();
    // the value of the <form>'s <input> element, toUpperCase()!

    if (strikes < maxStrikes) {
        // game logic goes here
        if(word.includes(guess)){
            for(i=0;i< word.length;i++){
                if(word.indexOf[i]==guess){
                    revealedLetters[i] == true;
                    drawWordProgress();
                }
            }
        } else{
            strikes++;
            strikeLetters.push(guess);
            drawGallows();
            drawStrikeLetters();
        }
    } else{
        alert("The game is over!"); 
    }
    for(i = 0;i < revealedLetters.length;i++){
        if(revealedLetters[i]==false){
            break;
        }else{
            alert("Player 2 Has Won!");
        }
    }    
}
document.getElementById("guessTheWord").addEventListener("submit",processGuess);
