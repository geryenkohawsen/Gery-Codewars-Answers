function removeEveryOther(arr) {
	const resultArr = [];
	arr.forEach((element, index) => {
		if (index % 2 === 0) resultArr.push(element);
	});
	return resultArr;
}
