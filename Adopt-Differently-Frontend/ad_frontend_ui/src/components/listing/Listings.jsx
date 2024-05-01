import React from "react";
import "./Listings.css";
import { Route } from "react-router-dom";

export function Listings() {
    return (
        <div>
            {/* <Route path="/adopt"> */}
                <div className="listings">
                    <ul>
                        <li>
                            <div className="listing">
                                <img src="https://www.the-sun.com/wp-content/uploads/sites/6/2023/10/www-instagram-com-monkeycatluna-hl-851711797.jpg" alt="Sprunk" />
                                <h1>Sprunk</h1>
                                <p>2000 years old</p>
                            </div>
                        </li>
                        <li>
                            <div className="listing">
                                <img src="https://ae01.alicdn.com/kf/S1725de5f515d42a49ffef70ae1cb0072T.jpg_640x640Q90.jpg_.webp" alt="Bingus" />
                                <h1>Bingus</h1>
                                <p>2 years old</p>
                            </div>
                        </li>
                        <li>
                            <div className="listing">
                                <img src="https://i.imgflip.com/56tplg.png" alt="Zingus" />
                                <h1>Zingus</h1>
                                <p>4 years old</p>
                            </div>
                        </li>
                        <li>
                            <div className="listing">
                                <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHEMERLotpBt9buY5OFK9Iu17UKhbQ_u-vN1V2czS-gA&s" alt="Dingus" />
                                <h1>Dingus</h1>
                                <p>12 years old</p> 
                            </div>
                        </li>
                        <li>
                            <div className="listing">
                                <img src="https://i.kym-cdn.com/entries/icons/facebook/000/048/010/side_eye_cat.jpg" alt="Mr. Beef" />
                                <h1>Mr. Beef</h1>
                                <p>9 years old</p> 
                            </div>
                        </li>
                    </ul>
                </div>
            {/* </Route> */}
        </div>
    );
}