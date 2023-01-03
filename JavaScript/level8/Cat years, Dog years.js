var humanYearsCatYearsDogYears = function (humanYears) {
	if (humanYears === 1) return [1, 15, 15];
	if (humanYears === 2) return [2, 24, 24];
	return [humanYears, 24 + 4 * (humanYears - 2), 24 + 5 * (humanYears - 2)];
};
