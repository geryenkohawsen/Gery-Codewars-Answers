function disemvowel(str) {
	const vowels = 'aiueoAIUEO';
	const newStrArr = [];
	str.split('').map((char) => {
		if (!vowels.includes(char)) newStrArr.push(char);
	});
	return newStrArr.join('');
}
