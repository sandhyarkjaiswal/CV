function Descending(arr) {
  const n = arr.length;

  for (let i = 0; i < n - 1; i++) {
      console.log("i: ",i);
    for (let j = 0; j < n - 1- i ; j++) {
        console.log(j);
      if (arr[j] < arr[j + 1]) {

        const temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }

  return arr;
}

const Array = [5, 2, 9, 1, 5, 6];
const sortedArray = Descending(Array);
console.log(sortedArray); // [9, 6, 5, 5, 2, 1]
