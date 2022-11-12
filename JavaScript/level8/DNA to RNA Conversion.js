function DNAtoRNA(dna) {
  let result = '';
  dna.split('').forEach((element) => {
    element === 'T' ? (result += 'U') : (result += element);
  });
  return result;
}

// Better Answers
// function DNAtoRNA(dna) {
//   return dna.replace(/T/g, 'U');
// }

// function DNAtoRNA(dna) {
//   return dna.split("T").join("U");
// }
