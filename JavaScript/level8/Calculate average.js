function findAverage(array) {
	if (array && array.length > 0) {
		let sum = 0;
		array.forEach((el) => (sum += el));
		return sum / array.length;
	}
	return 0;
}
