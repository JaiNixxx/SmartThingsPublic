/**
 *  Cox Homelife
 *
 *  Copyright 2017 David Nix
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Cox Homelife",
    namespace: "JaiNixxx",
    author: "David Nix",
    description: "This is my attempt to tie Cox Homelife into my ST.  This is my first SmartApp.",
    category: "Safety & Security",
    iconUrl: "https://media.consumeraffairs.com/files/cache/logos/cox-homelife_logo_6654_widget_logo.png",
    iconX2Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png",
    iconX3Url: "https://s3.amazonaws.com/smartapp-icons/Convenience/Cat-Convenience@2x.png")


preferences {
	section("Cox Homelife") {
		// TODO: put inputs here
	}
}

mappings {
    path("/oauth/initialize") {action: [GET: "https://portal.coxhomelife.com/sp/"]}
    path("/oauth/callback") {action: [GET: "callback"]}
}


def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers