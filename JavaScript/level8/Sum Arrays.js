function sum(numbers) {
	return numbers.reduce(
		(accumulator, currentValue) => accumulator + currentValue,
		0
	);
}
