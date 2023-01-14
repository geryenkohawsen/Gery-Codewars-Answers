function countSheeps(arrayOfSheep) {
	let count = 0;
	arrayOfSheep.forEach(el => {
		if (el) count++;
	});
	return count;
}
