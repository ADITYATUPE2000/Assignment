function sortArrayDescending() {
    const inputArray = [];

    // Ask the user for input until they enter a non-numeric value
    while (true) {
        const userInput = prompt("Enter a number :");

        // Convert the user input to a number
        const number = parseFloat(userInput);

        // Check if the input is a valid number
        if (!isNaN(number)) {
            inputArray.push(number);
        } else {
            break; // Exit the loop if the input is not a number
        }
    }

    // Sort the array in descending order
    inputArray.sort((a, b) => b - a);

    // Display the sorted array
    console.log("Sorted Array in Descending Order:", inputArray);
}

// Call the function to start the process
sortArrayDescending();