function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

// Get input from the user using the prompt function
const inputSentence = prompt("Enter a sentence to reverse the words:");

if (inputSentence) {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    alert("Reversed sentence: " + reversedSentence);
} else {
    alert("You didn't enter a sentence.");
}