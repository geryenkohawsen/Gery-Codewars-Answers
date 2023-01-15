function reverseWords(str) {
	const newArr = [];
	str.split(' ').forEach(el => {
		const reversedWord = el.split('').reverse().join('');
		newArr.push(reversedWord);
	});
	return newArr.join(' ');
}
a; //0xF
