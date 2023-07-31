let cart = document.querySelector(".cart-btn");
let select = document.querySelector(".select");
let buttons = document.getElementsByClassName("cart-button");
// let totals = document.querySelector(".total");
// let sum = 0;

for (btn of buttons) {
    btn.addEventListener("click", (e) => {
        let add = Number(cart.getAttribute('data-count') || 0);
        cart.setAttribute('data-count', add + 1);
        cart.classList.add('zero');

        // let count1 = e.target.parentNode.querySelector("h3").innerText.slice(1);
        // sum = sum + Number(count1);
        // totals.innerHTML = "$" + sum;

        // Copy carts to selected cart
        let parent = e.target.parentNode;
        let clone = parent.cloneNode(true);
        select.appendChild(clone);
        if (clone) {
            cart.onclick = () => {
                select.classList.toggle("display");
            }
        }

        const delBtn = document.createElement("button");
        delBtn.innerHTML = "sil"
        clone.appendChild(delBtn);

        delBtn.addEventListener("click", (e) => {
            console.log(e.target.parentNode);
            select.removeChild(clone);

            // let count2 = e.target.parentNode.querySelector("h3").innerText.slice(1);
            // sum = sum - Number(count2);
            // totals.innerHTML = "$" + sum;
        })

        // image animation;
        // let image = e.target.parentNode.querySelector("img");
        let span = e.target.parentNode.querySelector('span');
        // let s_image = image.cloneNode(true);

        span.classList.add('active');
        setTimeout(() => {
            span.removeChild('active');
            span.classList.remove('active');
        }, 500)
    })
}