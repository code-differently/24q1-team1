import React from 'react';
import "./Header.css";
import logo from '../../assets/FullAdoptDifferentlyLogo.png';
import {Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';
import {NavLink, BrowserRouter} from 'react-router-dom';



export const Header = () => {
    return <div>
        <header className="header">
            <BrowserRouter>
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
                    <button className="search-btn">Search</button>
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
            </BrowserRouter>
        </header>
    </div>
}