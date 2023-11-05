function revWordInSentence(sentence) {
    const words = [];
    let word = '';
    for (let i = 0; i < sentence.length; i++) {
        const char = sentence[i];
        if (char === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
                word += char;
            }
            // Reverse the word by iterating over characters in reverse order
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            words.push(reversedWord);
            word = '';
        } else {
            word += char;
        }
    }

    return words.join(' ');
}
var userInput =prompt("Enter something:");
console.log("User Input: " + userInput);
console.log(revWordInSentence(userInput));

