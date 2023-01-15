function stray(numbers) {
	let firstChar = numbers[0];

	if (firstChar !== numbers[1] && firstChar !== numbers[2]) return firstChar;

	for (let i = 1; i < numbers.length; i++) {
		if (firstChar !== numbers[i]) return numbers[i];
	}
}
