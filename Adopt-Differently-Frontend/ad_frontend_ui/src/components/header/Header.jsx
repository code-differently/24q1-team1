import React from 'react';
import "./Header.css";
import logo from '../../assets/FullAdoptDifferentlyLogo.png';
import {NavLink} from 'react-router-dom';
import sound from '../../assets/audio.mp3';


export const Header = () => {
    let audio = new Audio(sound);

    const start = () => {
        audio.play()
    }

    return <div>
        <header className="header">
            <div className="logoWrapper">
                <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/">
                    <img src={logo} alt="Adopt Differently Logo" className="logo"/>
                </NavLink>
            </div>
            <nav id= "nav-tabs">
            <ul className="header-top-menu">
                <li>
                    <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/about">About</NavLink>
                </li>
                <li>
                    <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/adopt">Adopt</NavLink>
                </li>
                <li>
                    <NavLink className={({ isActive, isPending }) => isPending ? "pending" : isActive ? "active" : ""} to="/help">Help</NavLink>
                </li>
            </ul>
            </nav>
            <div className="header-left">
                <input type="text" placeholder="Start Your Search Here!" className="search" id='search' />
                <button className="search-btn" onClick={() =>{ 
                    if (document.getElementById('search').value === "") {
                        alert("Please enter something to search!")
                    }
                    else if (document.getElementById('search').value === "2 of Us") {
                        start()
                    }
                    else {
                        
                    }
                }}>Search</button>
            </div>
            <div className="header-top-right">
                <div className="signin">
                    <li>
                        <a to="/signin">Sign In</a>
                    </li>
                </div>
                <div className="signup">
                    <li>
                        <a to="/signup">Sign Up</a>
                    </li>
                </div>
            </div>
        </header>
    </div>
}