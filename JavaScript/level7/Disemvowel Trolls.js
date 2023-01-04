function disemvowel(str) {
	const vowels = 'aiueoAIUEO';
	const newStrArr = [];
	str.split('').map((char) => {
		if (!vowels.includes(char)) newStrArr.push(char);
	});
	return newStrArr.join('');
}

// // REGEX
// function disemvowel(str) {
// 	return (str || '').replace(/[aeiou]/gi, '');
// }

// // split filter join
// const vowels = 'aeiou';

// function disemvowel(str) {
//   return str
//     .split('')
//     .filter(letter => !vowels.includes(letter.toLowerCase()))
//     .join('');
// }
