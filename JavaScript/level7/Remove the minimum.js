function removeSmallest(numbers) {
	const minNumIndex = numbers.indexOf(Math.min(...numbers));
	return numbers.filter((el, idx) => idx !== minNumIndex);
}
