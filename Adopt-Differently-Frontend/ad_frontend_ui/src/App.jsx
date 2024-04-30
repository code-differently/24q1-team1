import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Header } from './components/header/Header'
import { Footer } from './components/footer/Footer'
import { Listing } from './components/listing/Listing'
function App() {
  return (
    <div className="App">
      <div>
        <Header />
        <p>meow meow</p>
        <Listing />
      </div>
      <Footer />
    </div>
  )

}
export default App
