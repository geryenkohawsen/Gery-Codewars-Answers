function findNeedle(haystack) {
  const index = haystack.indexOf('needle');
  if (index === -1) {
    return "Your function didn't return anything";
  }
  return `found the needle at position ${index}`;
}
