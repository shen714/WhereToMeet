import React, { Component } from 'react'
import { Nav, Navbar } from "react-bootstrap"
import { withRouter } from 'react-router-dom'
import AuthenticationService from '../service/AuthenticationService'

class NavBarComponent extends Component {
    render() {
        const isUserLoggedIn = AuthenticationService.isUserLoggedIn();

        return(
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark" className="Navbar">
                <Navbar.Brand href="/">Where To Meet</Navbar.Brand>
                <Navbar.Toggle aria-controls="responsive-navbar-nav" />
                <Navbar.Collapse id="responsive-navbar-nav">
                    <Nav className="mr-auto">
                        <Nav.Link href="/aboutus">About Us</Nav.Link>
                    </Nav>
                    <Nav>
                        {!isUserLoggedIn && <li><Nav.Link href="/signup">Sign Up</Nav.Link></li>}
                        {isUserLoggedIn && <li><svg className="bi bi-person" width="32" height="32" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg"><path fillRule="evenodd" d="M15 16s1 0 1-1-1-4-6-4-6 3-6 4 1 1 1 1h10zm-9.995-.944v-.002zM5.022 15h9.956a.274.274 0 00.014-.002l.008-.002c-.001-.246-.154-.986-.832-1.664C13.516 12.68 12.289 12 10 12c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664a1.05 1.05 0 00.022.004zm9.974.056v-.002zM10 9a2 2 0 100-4 2 2 0 000 4zm3-2a3 3 0 11-6 0 3 3 0 016 0z" clipRule="evenodd"/></svg></li>}
                    </Nav>
                    <Nav>
                        {!isUserLoggedIn && <li><Nav.Link href="/">Login</Nav.Link></li>}
                        {isUserLoggedIn && <li><Nav.Link  href="/logout" onClick={AuthenticationService.logout}>Logout</Nav.Link></li>}
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
           
        )
    }
}

export default withRouter(NavBarComponent)