function sumArray(array) {
	if (array) {
		return 0;
	}
	const minNum = Math.min(...array);
	const maxNum = Math.max(...array);
	const sum = 0;
	array.forEach((el) => {
		sum += el;
	});
	return sum - minNum - maxNum;
}
