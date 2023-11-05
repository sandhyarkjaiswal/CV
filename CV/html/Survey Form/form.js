const form = document.getElementById('survey-form');
    const submitBtn = document.getElementById('submit-btn');
    const resetBtn = document.getElementById('reset-btn');
    const popup = document.getElementById('popup');
    const closePopupBtn = document.getElementById('close-popup');

    submitBtn.addEventListener('click', function() {
      const firstName = document.getElementById('first-name').value;
      const lastName = document.getElementById('last-name').value;
      const dob = document.getElementById('dob').value;
      const country = document.getElementById('country').value;
      const genderElements = document.getElementsByName('gender');
      const gender = Array.from(genderElements)
        .filter(checkbox => checkbox.checked)
        .map(checkbox => checkbox.value)
        .join(', ');
      const profession = document.getElementById('profession').value;
      const email = document.getElementById('email').value;
      const mobile = document.getElementById('mobile').value;

      // Validation checks can be added here

      const popupContent = `
        <b>First Name:</b> ${firstName}<br>
        <b>Last Name:</b> ${lastName}<br>
        <b>Date of Birth:</b> ${dob}<br>
        <b>Country:</b> ${country}<br>
        <b>Gender:</b> ${gender}<br>
        <b>Profession:</b> ${profession}<br>
        <b>Email:</b> ${email}<br>
        <b>Mobile Number:</b> ${mobile}<br>
      `;

      document.getElementById('popup-content').innerHTML = popupContent;
      popup.style.display = 'block';
    });

    closePopupBtn.addEventListener('click', function() {
      popup.style.display = 'none';
      form.reset();
    });

    resetBtn.addEventListener('click', function() {
      form.reset();
    });